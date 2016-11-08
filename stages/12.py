import json
stage='12'
data={}
data['width']=10
data['height']=5
data['hints']={}
data['hints']['horizontal']=['1 1','2 2','1 1','1 2','2 1','1 2','2 2','4','3','1 1']
data['hints']['vertical']=['1 3','5 3','3','1 1 4','8 1']
data['answer']=[]
data['answer'].append([0,1,0,0,1,1,1,0,0,0])
data['answer'].append([1,1,1,1,1,0,1,1,1,0])
data['answer'].append([0,0,0,0,0,0,0,1,1,1])
data['answer'].append([0,1,0,1,0,1,1,1,1,0])
data['answer'].append([1,1,1,1,1,1,1,1,0,1])

json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
