import json
stage='21'
data={}
data['width']=15
data['height']=15
data['name']='The big storm'
data['hints']={}
data['hints']['horizontal']=['6 1 3','3 3 1 2','4 1 3','2 1 3','3 1 1 3','6 1 2','3 3','4 2 3','2 3 1 1 3','4 1 2','4 3','3 1 2','4 1 3 3','2 3 1 2','3 3']
data['hints']['vertical']=['4 4 4','4 4 4','3 4 4 1','1 4 4 3','1 2 2 2','2 1 3 2','2 1 1 1','1 1 1 1','1 1 1 2','1 1 1','1 1','1 3 3 3 1','15','3 3 3 3','0']
data['answer']=[]
data['answer'].append([1,1,1,1,0,1,1,1,1,0,1,1,1,1,0])
data['answer'].append([1,1,1,1,0,1,1,1,1,0,1,1,1,1,0])
data['answer'].append([1,1,1,0,1,1,1,1,0,1,1,1,1,0,1])
data['answer'].append([1,0,1,1,1,1,0,1,1,1,1,0,1,1,1])
data['answer'].append([1,0,0,0,1,1,0,0,1,1,0,0,0,1,1])
data['answer'].append([1,1,0,0,0,1,0,1,1,1,0,0,1,1,0])
data['answer'].append([0,1,1,0,1,0,0,1,0,0,0,1,0,0,0])
data['answer'].append([0,1,0,0,0,1,0,0,1,0,0,0,1,0,0])
data['answer'].append([1,0,0,0,1,0,0,0,0,1,0,0,1,1,0])
data['answer'].append([0,1,0,0,0,0,0,0,1,0,0,0,1,0,0])
data['answer'].append([0,0,0,1,0,0,0,1,0,0,0,0,0,0,0])
data['answer'].append([1,0,1,1,1,0,1,1,1,0,1,1,1,0,1])
data['answer'].append([1,1,1,1,1,1,1,1,1,1,1,1,1,1,1])
data['answer'].append([1,1,1,0,1,1,1,0,1,1,1,0,1,1,1])
data['answer'].append([0,0,0,0,0,0,0,0,0,0,0,0,0,0,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
