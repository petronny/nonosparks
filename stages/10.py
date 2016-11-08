import json
stage='10'
data={}
data['width']=10
data['height']=10
data['hints']={}
data['hints']['horizontal']=['5','1 3','2 3 2','3 2 2','2 1 3','1 5 1','1 2 2','1 3 3','2 1 4','3 1 2']
data['hints']['vertical']=['3 2','8','1 1','1 1 1','2 2 2','1 2 3 1','1 4 1','2 2 2','5 4','4 5']
data['answer']=[]
data['answer'].append([0,0,1,1,1,0,0,0,1,1])
data['answer'].append([0,0,1,1,1,1,1,1,1,1])
data['answer'].append([0,0,0,1,0,0,0,0,0,1])
data['answer'].append([0,0,1,0,0,1,0,1,0,0])
data['answer'].append([0,1,1,0,1,1,0,1,1,0])
data['answer'].append([1,0,1,1,0,1,1,1,0,1])
data['answer'].append([1,0,0,1,1,1,1,0,1,0])
data['answer'].append([1,1,0,0,1,1,0,1,1,0])
data['answer'].append([1,1,1,1,1,0,1,1,1,1])
data['answer'].append([1,1,1,1,0,1,1,1,1,1])

json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
